package com.util.benchmark;

import com.util.SequenceGenerator;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class IdGeneratorBenchmark {

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(IdGeneratorBenchmark.class.getSimpleName())
                .mode(Mode.SampleTime)
                .measurementTime(TimeValue.seconds(10))
                .timeUnit(TimeUnit.MICROSECONDS)
                .build();

        new Runner(opt).run();
    }

    private SequenceGenerator generator;

    @Setup
    public void setup() {
        generator = new SequenceGenerator();
    }

    @Benchmark
    public UUID generateIdWithUUID() {
        return UUID.randomUUID();
    }

    @Benchmark
    public long generateIdWithSnowflake() {
        return generator.nextId();
    }

}

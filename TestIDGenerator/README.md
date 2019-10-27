# Java 8 JMH Benchmarks

The benchmarks were obtained using JMH 1.21 on OpenJDK JDK 1.8.0_232 64Bit 
and Ubuntu 19.10 on an Ryzen 3700X

All measurements are given as Sample (operations per microsecond).

## Benchmark results
```
Benchmark                                                                       Mode      Cnt     Score   Error  Units
IdGeneratorBenchmark.generateIdWithSnowflake                                  sample  8002932     0.175 ± 0.010  us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p0.00    sample              0.060          us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p0.50    sample              0.070          us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p0.90    sample              0.071          us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p0.95    sample              0.071          us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p0.99    sample              0.071          us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p0.999   sample              0.091          us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p0.9999  sample            701.440          us/op
IdGeneratorBenchmark.generateIdWithSnowflake:generateIdWithSnowflake·p1.00    sample            789.504          us/op
IdGeneratorBenchmark.generateIdWithUUID                                       sample  7228125     0.465 ± 0.016  us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p0.00              sample              0.080          us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p0.50              sample              0.350          us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p0.90              sample              0.360          us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p0.95              sample              0.361          us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p0.99              sample              0.431          us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p0.999             sample              0.701          us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p0.9999            sample           1044.480          us/op
IdGeneratorBenchmark.generateIdWithUUID:generateIdWithUUID·p1.00              sample           6266.880          us/op
```
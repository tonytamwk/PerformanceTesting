#include <stdio.h>
#include <unistd.h>

typedef unsigned long long uint64;

static __inline__ uint64 rdtsc_e(void)
{
  unsigned a, d; 
  asm volatile("rdtscp" : "=a" (a), "=d" (d)); 
  return ((unsigned long)a) | (((unsigned long)d) << 32);
}

int main()
{
    uint64 start = rdtsc_e();
    int pid = getpid();
    uint64 end = rdtsc_e();
    uint64 clock_spent = (end - start);
    printf("pid=%d\n", pid);
    printf("Time spent is %llu\n", (uint64) clock_spent);

    return 0;
}

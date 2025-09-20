def job_scheduling(jobs):
    # Sort jobs in decreasing order of profit
    jobs.sort(key=lambda job: job[2], reverse=True)
    
    # Find the maximum deadline
    max_deadline = max(job[1] for job in jobs)
    schedule = [-1] * (max_deadline + 1)  # Using 1-based indexing
    
    count_jobs = 0
    total_profit = 0
    
    # Assign jobs to the latest possible available slot
    for job in jobs:
        print(jobs)
        for j in range(job[1], 0, -1):  # Try to place job before or on deadline
            if schedule[j] == -1:  # Found a free slot
                schedule[j] = job[0]
                print(schedule, job)
                count_jobs += 1
                total_profit += job[2]
                break
    return [count_jobs, total_profit, schedule]

jobno = [1, 2, 3, 4, 5]
deadline = [2, 1, 2, 1, 3]
profit = [100, 19, 27, 25, 15]
jobs = list(zip(jobno, deadline, profit))

result = job_scheduling(jobs)
print(result)  # Output: [Number of jobs done, Total profit]


# Time  Complexity : O(NlogN) + O(N*M) -> Sorting + 2 loops pf 
# Space Complexity : O(M)  -> for result
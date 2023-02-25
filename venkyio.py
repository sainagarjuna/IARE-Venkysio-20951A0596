g_s=float(input())
no_of_weeks=int(input())
a,b,c=map(float,input().split())

net_pay=g_s-((a+b+c)/100)*g_s
print(net_pay*no_of_weeks)
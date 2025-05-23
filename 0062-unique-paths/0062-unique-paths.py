class Solution(object):
    
    def uniquePaths(self, m, n):
        def fact(n):
            if (n==1 or n==0):
                return 1
            else : return n*fact(n-1)
        if(m == 1 or n == 1) :
            return 1
        m=m-1
        n=n-1
        if(m < n):  
            m,n=n,m
        
        res = 1
        j = 1
        res=fact(m+n)/(fact(m)*fact(n))
        return res
        
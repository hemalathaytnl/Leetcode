class Solution(object):
    def numSteps(self, s):
        """
        :type s: str
        :rtype: int
        """
        num = int(s, 2) 
        return self.cal(num, 0)
    def cal(self, n, co):
        if n == 1:
            return co
        
        if n % 2 == 0:
            return self.cal(n // 2, co + 1)
        else:
            return self.cal(n + 1, co + 1)
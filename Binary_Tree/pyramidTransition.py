class Solution(object):
    def pyramidTransition(self, bottom, allowed):
        mpp = defaultdict(list)

        def dfs(bott, idx, temp):
            if(len(bott)== 1):
                return True
            if(idx == len(bott)-1):
                return dfs(temp, 0, '')
            
            key = bott[idx:idx+2]

            if key not in mpp:
                return False

            for ch in mpp[key]:
                if dfs(bott, idx+1, temp+ch):
                    return True
            return False

        for pairs in allowed:
            mpp[pairs[0:2]].append(pairs[2])
        return dfs(bottom, 0, '')
        
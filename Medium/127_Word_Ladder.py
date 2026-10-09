class Solution:
    def ladderLength(self, s: str, e: str, wordList: list[str]) -> int:
        dead=set(wordList)
        if s == e:
            return 0
        if e not in dead:
            return 0
        q=deque()
        q.append((s,1))
        dead.discard(s)
        while q:
            state,dist=q.popleft()
            if state == e:
                return dist
            for i in range(len(state)):
                for c in "abcdefghijklmnopqrstuvwxyz":
                    if c==state[i]:
                        continue
                    comb=state[:i]+c+state[i+1:]
                    if comb in dead:
                        q.append((comb,dist+1))
                        dead.remove(comb)
        return 0
        

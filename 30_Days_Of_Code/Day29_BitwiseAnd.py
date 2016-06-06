#!/bin/python

import sys


t = int(raw_input().strip())
for a0 in xrange(t):
    n,k = raw_input().strip().split(' ')
    n,k = [int(n),int(k)]
    poss = 0
    for i in reversed(range(1,min(n+1,k))):
        test = list(format(i,'b'))
        if '0' in test:
            for j in reversed(range(len(test))):
                if test[j] == '0':
                    test[j] = '1'
                    break

        else:
            test.append('1')
        if int(''.join(test),2) <= n:
            poss = i
            break
    print poss


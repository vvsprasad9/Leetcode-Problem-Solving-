 class Solution {
      public int beautySum(String s) {

          int result = 0;
          char[] ch = s.toCharArray();
          int n = ch.length;

          for (int i = 0; i < n; i++) {

              int[] freq = new int[26];
              int[] histo = new int[n + 1];

              int max = -1;
              int min = n + 1;

              for (int j = i; j < n; j++) {

                  int f = ++freq[ch[j] - 'a'];

                  if (f > max) {
                      max = f;
                      histo[max] = 0;
                  }

              ++histo[f];

                  if (f == 1 ||
                      (--histo[f - 1] == 0 && f - 1 == min)) {
                      min = f;
                  }

                  result += max - min;
              }
          }

          return result;
      }
  }
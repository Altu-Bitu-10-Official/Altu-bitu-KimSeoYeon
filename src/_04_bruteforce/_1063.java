package _04_bruteforce;

import java.util.*;
import java.io.*;

public class _1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String King = st.nextToken();
        String Stone = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        int kx = King.charAt(0) - 'A';
        int ky = King.charAt(1) - '1';

        int sx = Stone.charAt(0) - 'A';
        int sy = Stone.charAt(1) - '1';

        for(int i=0;i<N;i++){
        String s = br.readLine();
        switch(s){
            case "R":
                if(kx+1 < 8){
                    kx++;
                    if(kx == sx && ky == sy){
                        if(sx+1 < 8){
                            sx++;
                        } else {
                            kx--;
                        }
                    }
                }
                break;
            case "L":
                if(kx-1 >=0){
                    kx--;
                    if(kx == sx && ky == sy){
                        if(sx-1 >= 0){
                            sx--;
                        } else {
                            kx++;
                        }
                    }
                }
                break;
            case "B":
                if(ky-1 >= 0){
                    ky--;
                    if(kx == sx && ky == sy){
                        if(sy-1 >= 0){
                            sy--;
                        } else {
                            ky++;
                        }
                    }
                }
                break;
            case "T":
                if(ky +1<8){
                    ky++;
                    if(kx == sx && ky == sy){
                        if(sy+1 < 8){
                            sy++;
                        } else {
                            ky--;
                        }
                    }
                }break;
            case "RT":
                if(kx+1 < 8 && ky+1 < 8){
                    kx++;
                    ky++;
                    if(kx == sx && ky == sy){
                        if(sx+1 < 8 && sy+1 < 8){
                            sx++;
                            sy++;
                        } else {
                            kx--;
                            ky--;
                        }
                    }
                }break; 
            case "LT":
                if (kx-1 >= 0 && ky+1 < 8){
                    kx--;
                    ky++;
                    if(kx == sx && ky == sy){
                        if(sx-1 >= 0 && sy+1 < 8){
                            sx--;
                            sy++;
                        } else {
                            kx++;
                            ky--;
                        }
                    }
            }break;
                case "RB":

                    if(kx+1 < 8 && ky-1 >= 0){
                        kx++;
                        ky--;
                        if(kx == sx && ky == sy){
                            if(sx+1 < 8 && sy-1 >= 0){
                                sx++;
                                sy--;
                            } else {
                                kx--;
                                ky++;
                            }
                        }
                    }break;
            case "LB" :
                if(kx-1 >=0 && ky-1 >= 0){
                    kx--;
                    ky--;
                    if(kx == sx && ky == sy){
                        if(sx-1 >= 0 && sy-1 >= 0){
                            sx--;
                            sy--;
                        } else {
                            kx++;
                            ky++;
                        }
                    }
                }break;
        }}

        System.out.println((char)(kx+'A') +""+(char)(ky+'1'));
        System.out.println((char)(sx+'A') +""+(char)(sy+'1'));

    }
}

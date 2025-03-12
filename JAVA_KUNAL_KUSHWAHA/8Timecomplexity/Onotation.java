/*
 *  O notation upper bound 
 *    lim            f(x)/g(x) < infinity
 *    n->infinity
 * 
 *  big o mega : opposite of big Oh
 *     ex--> omega(N^3) lower bound 
 *     ex--> omega(6 N^3 + N^3 logN + .. ) but not with terms less than N^3 i.e N^2 and on .
 *     lim            f(x)/g(x) > 0
 *    n->infinity
 *  
 *  Theta notation : both upper bound and lower bound 
 *   ex---> theta(N^2) 
 *  0<      lim            f(x)/g(x) < infinity
 *       n->infinity
 * 
 *   little o notation : this is loose upper bound
 *    
 *   big O notation            little o notation
 *     f=O(g)                      f=o(g)
 *    then f<=g                   then f<g f strictly slower than g
 * 
 *     lim            f(x)/g(x) = 0
 *    n->infinity
 * 
 *  little omega notation : loosely lower bound
 *   
 *   big Omega          lower omega
 *  f= omega g            f= omega g
 *  f>= g                 f>g strictly
 * 
 *     lim            f(x)/g(x) = infinity
 *    n->infinity
 * 
 *   
 *   
 */

public class Onotation {
    public static void main(String[] args) {
        
    }
}

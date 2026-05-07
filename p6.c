#include<stdio.h>
unsigned int xor_hash(int num){
    unsigned int hash=0;
    while(num>0){
        hash^=num%10;
        num/=10;
    }
    return hash;
}
int main(){
    int num1=123, num2=456;
    unsigned int hash1= xor_hash(num1);
    unsigned int hash2=xor_hash(num2);
    printf("Number1: %d, Hash1: %u\n",num1, hash1);
    printf("Number2: %d, Hash2: %u",num2, hash2);
    return 0;
}

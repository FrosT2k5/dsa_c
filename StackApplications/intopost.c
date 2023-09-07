#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define MAX 100

char stack[MAX];
char infix[100],postfix[100];
int top=-1;

int isfull() {
    return (top+1 == MAX);
}

int isempty() {
    return (top == -1);
}

void print() {
    int i;
    printf("\nInfix to postfix: \n%s \n",postfix);
}

void push(char d) {
    if (isfull())
        printf("\nStack overflow");
    else {
        top++;
        stack[top] = d;
    }
}

char pop() {
    if (isempty()) {
        printf("\nStack is empty");
        exit(1);
    }
    else
        return stack[top--];
}

int precedence (char c) {
    if (c == '^')
        return 3;
    else if (c == '*' || c == '/')
        return 2;
    else if (c == '+' || c == '-')
        return 1;
    else
        return 0;
}

void intopost() {
    char symbol,next;
    int i,j=0; 
    for (i=0;i<strlen(infix);i++) {
        symbol = infix[i];
        switch (symbol) {
            case '(':
                push(symbol);
                break;
            case ')':
                next = pop();
                while (next != '(') {
                    postfix[j++] = next;
                    next = pop();
                }
                break;
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                while (!isempty() && precedence(stack[top]) >= precedence(symbol))
                    postfix[j++] = pop();
                push(symbol);
                break;
            default:
                postfix[j++] = symbol;
                break;
        }
    }
    while (!isempty())
        postfix[j++] = pop();
    postfix[j] = '\0';
}

int main () {
    printf("Enter infix exp: ");
    fgets(infix,MAX,stdin);
    infix[strcspn(infix,"\n")] = 0;
    intopost();
    print();
    return 0;
}


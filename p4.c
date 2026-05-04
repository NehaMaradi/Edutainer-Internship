//c program to demonstrate preorder traversal

#include<stdio.h>
#include<stdlib.h>

//Definition for a binary tree nnode
struct TreeNode{
    int data;
    struct TreeNode *left;
    struct TreeNode *right;
};

//Function for preorder traversal of a binary tree
void preorderTraversal(struct TreeNode* root){
    if(root!=NULL){
        //Process the current node
        printf("%d ", root->data);

        //Traverse the left subtree
        preorderTraversal(root->left);

        //Traverse the right subtree
        preorderTraversal(root->right);
    }
}

struct TreeNode* createNode(int data)
{
    struct TreeNode* newNode=(struct TreeNode*)malloc(sizeof(struct TreeNode));
    if(newNode==NULL) exit(EXIT_FAILURE);
    newNode->data=data;
    newNode->left=NULL;
    newNode->right=NULL;
    return newNode;
}

int main(){
    struct TreeNode* root = createNode(1);
    root->left = createNode(2);
    root->right = createNode(3);
    root->left->left = createNode(4);
    root->right->left = createNode(5);
    printf("preorder traversal...\n");
    preorderTraversal(root);
    return 0;
}
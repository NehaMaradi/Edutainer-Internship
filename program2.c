#include<stdio.h>
#include<stdlib.h>

//Definition for a binary tree
struct TreeNode {
    int data;
    struct TreeNode *left;
    struct TreeNode *right;
};

void inordertraversal(struct TreeNode* root){
    if(root!=NULL){
    inordertraversal(root->left); //left subtree
    printf("%d ", root->data); //processing the current node
    inordertraversal(root->right); //right subtree
}
}

struct TreeNode* createNode(int data){
    struct TreeNode* newNode=(struct TreeNode*)malloc(sizeof(struct TreeNode));
    if(newNode == NULL){
        exit(EXIT_FAILURE);
    }
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
} 

int main(){
    struct TreeNode *root=createNode(1);
    root->left=createNode(2);
    root->right=createNode(3);
    root->left->left=createNode(4);
    root->right->left=createNode(5);
    printf("inorder Traversal..\n");
    inordertraversal(root);
    return 0;
}

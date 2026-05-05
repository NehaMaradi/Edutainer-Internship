// C program to demonstrate postorder traversal of a binary tree

#include<stdio.h>
#include<stdlib.h>

//Definition for a binary tree
struct TreeNode {
    int data;
    struct TreeNode *left;
    struct TreeNode *right;
};

void postOrderTraversal(struct TreeNode* root){
    if(root!=NULL){
        //Traverse the left subtree
        postOrderTraversal(root->left);

        //Traverse the right subtree
        postOrderTraversal(root->right);

        //Process the current node
        printf("%d ", root->data);
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
    printf("postorder traversal...\n");
    postOrderTraversal(root);
    return 0;
}

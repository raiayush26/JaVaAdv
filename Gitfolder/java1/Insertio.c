#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <stdbool.h>
struct ListNode
{
  int data;
  struct ListNode *next;
};

void print(stuct ListNode *head){
  struct ListNode *cur =head;
  for(cur =head;cur!=NULL; cur =cur->next){
    printf("%d",cur->data);
  }
  printf("\n");

}
int length(struct ListNode *head){
  struct ListNode *cur = head;
  int count = 0;
  for(cur = head; cur!=NULL; cur=cur->next){
    count ++;
    cur = cur->next;

  }
  return count;
}

struct ListNode *insertAtEnd(struct ListNode *head, int data)
{
          struct ListNode *temp,*curr;
          temp = (struct ListNode *)malloc(sizeof(struct ListNode));
          temp ->data =data;
          temp->next=NULL;
          *curr = head;
          if (cur ==NULL){
                    head=temp;

          }
          else{
                    while (cur->next != NULL)

                    {
                     cur=cur->next;
                     cur->next =temp;

                    }
                    return head ;
                    
          }

          /* data */
};
int main(){
         
    
  

          
}

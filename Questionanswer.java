package com.example.quizapp;

public class QuestionAnswer {
    public static String question[]={
            "What is a data structure?",
            "What are the disadvantages of arrays?",
            "Which data structure is used for implementing recursion?",
            "The data structure required to check whether an expression contains a balanced parenthesis is?",
            "Which of the following is not the application of stack?",
            "Which data structure is needed to convert infix notation to postfix notation?",
            "What is the value of the postfix expression 6 3 2 4 + – *?",
            "What data structure would you mostly likely see in non recursive implementation of a recursive algorithm?",
            "Which of the following statement(s) about stack data structure is/are NOT correct?",
            "The data structure required for Breadth First Traversal on a graph is?"
    };

    public static String choices[][]={
            {" A programming language"," A collection of algorithms",
            " A way to store and organize data","A type of computer hardware"},

            {"Index value of an array can be negative","Elements are sequentially accessed","Data structure like queue or stack cannot be implemented","There are chances of wastage of memory space if elements inserted in an array are lesser than the allocated size"},

            {"Stack","Queue","List","Array"},
            {"Stack","Queue","Tree","Array"},
            {"Data Transfer between two asynchronous process"," Compiler Syntax Analyzer","Tracking of local variables at run time","A parentheses balancing program"},
            {"Tree","Branch","Stack","Queue"},
            {"74","-18","22","40"},
            {"Stack","Linked List","Tree","Queue"},
            {"Top of the Stack always contain the new node","Stack is the FIFO data structure","Null link is present in the last node at the bottom of the stack","Linked List are used for implementing Stacks"},
            {"Stack","Queue","Tree","Array"}
    };

    public static String correctAnswers[]={"A way to store and organize data",
            "There are chances of wastage of memory space if elements inserted in an array are lesser than the allocated size",
            "Stack",
            "Stack",
            "Data Transfer between two asynchronous process",
            "Stack",
            "-18",
            "Stack",
            "Stack is the FIFO data structure",
            "Queue"};

}


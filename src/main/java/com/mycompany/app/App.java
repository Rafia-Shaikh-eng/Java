/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import javax.print.event.PrintEvent;

public class App {
    public static void Say(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        int a=1;
        float b=2.1f;
        System.out.println("Hello Remote World!");
        System.out.println(a+b);
        Say();

    }
}

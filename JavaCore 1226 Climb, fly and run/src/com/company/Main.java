package com.company;

/*

1226 Climb, fly and run
1. In the Solution class, create a public interface Fly with the void fly () method.
2. In the Solution class, create a public interface Climb using the void climb () method.
3. In the Solution class, create a public interface Run with the void run () method.
4. Think logically what interfaces you need to add for each class.
5. Add interfaces to the classes Cat, Dog, Tiger, Duck.

Requirements:
1. The Solution class must contain a Fly interface with the void fly () method.
2. The Solution class must contain a Climb interface with the void climb () method.
3. The Solution class must contain a Run interface with the void run () method.
4. A Cat object must be able to run (support the Run interface) and climb trees (support the Climb interface).
5. An object of the Dog class must be able to run (support the Run interface).
6. The Tiger class must be a cat.
7. An object of the Duck class must be able to run (to support the Run interface) and to fly (to support the Fly interface).



 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public class Cat implements Run, Climb {
        @Override
        public void climb() {
        }
        @Override
        public void run() {
        }
    }

    public class Dog implements Run {
        @Override
        public void run() {
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements Fly, Run {
        @Override
        public void fly() {
        }

        @Override
        public void run() {
        }
    }
    public interface Fly {
        void fly();
    }

    public interface Climb {
        void climb();
    }

    public interface Run {
        void run();
    }
}




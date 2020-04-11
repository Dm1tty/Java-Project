package com.company;
import java.io.*;

public class CISP401V11A5 {

    public static void main(String[] args) throws Exception {

        try {
            CISP401Method();
        } catch (Exception exc) {

            System.out.println("Exception thrown in " + exc.getStackTrace()[0].getMethodName() + "\n");
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String exceptionToStringType = stringWriter.toString();
            String beginning = exceptionToStringType.substring(0, 19);
            String end = exceptionToStringType.substring(19);

            System.out.println(beginning + ": Exception thrown in " + exc.getStackTrace()[0].getMethodName() + end);

        }

    }
    public static void CISP401Method() throws Exception {

        try {
            CISP401Method2();
        } catch (Exception e) {
            throw e;
        }
    }

    public static void CISP401Method2() throws Exception {
        throw new Exception();
    }
}


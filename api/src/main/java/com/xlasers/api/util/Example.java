package com.xlasers.api.util;

import com.github.therapi.runtimejavadoc.*;

/**
 * <p>
 *
 * </p>
 *
 * @package: com.xlasers.api.util
 * @author: Elijah.D
 * @time: CreateAt 2018/10/26 && 13:26
 * @description:
 * @copyright: Copyright © 2018 xlasers
 * @version: V1.0
 * @modified: Elijah.D
 */
public class Example {
    private static final CommentFormatter FORMATTER = new CommentFormatter();

    public static void printJavadoc(String fullyQualifiedClassName) {
        ClassJavadoc classDoc = RuntimeJavadoc.getJavadoc(fullyQualifiedClassName);
        if (classDoc.isEmpty()) {
            System.out.println("no documentation for " + fullyQualifiedClassName);
            return;
        }

        System.out.println("----------------------"+classDoc.getFields().get(0).getComment());

        System.out.println("----1"+classDoc.getName());
        System.out.println("----2"+format(classDoc.getComment()));
        System.out.println();

        // @see tags
        for (SeeAlsoJavadoc see : classDoc.getSeeAlso()) {
            System.out.println("See also: " + see.getLink());
        }
        // miscellaneous and custom javadoc tags (@author, etc.)
        for (OtherJavadoc other : classDoc.getOther()) {
            System.out.println(other.getName() + ": " + format(other.getComment()));
        }

        System.out.println();
        System.out.println("METHODS");

        for (MethodJavadoc methodDoc : classDoc.getMethods()) {
            System.out.println(methodDoc.getName() + methodDoc.getParamTypes());
            System.out.println(format(methodDoc.getComment()));
            System.out.println("  returns " + format(methodDoc.getReturns()));

            for (SeeAlsoJavadoc see : methodDoc.getSeeAlso()) {
                System.out.println("  See also: " + see.getLink());
            }
            for (OtherJavadoc other : methodDoc.getOther()) {
                System.out.println("  " + other.getName() + ": "
                        + format(other.getComment()));
            }
            for (ParamJavadoc paramDoc : methodDoc.getParams()) {
                System.out.println("  param " + paramDoc.getName() + " "
                        + format(paramDoc.getComment()));
            }
            for (ThrowsJavadoc throwsDoc : methodDoc.getThrows()) {
                System.out.println("  throws " + throwsDoc.getName() + " "
                        + format(throwsDoc.getComment()));
            }
            System.out.println();
        }
    }

    private static String format(Comment c) {
        return FORMATTER.format(c);
    }

    public static void main(String[] args) {
        Example.printJavadoc("com.xlasers.api.Api");
    }
}
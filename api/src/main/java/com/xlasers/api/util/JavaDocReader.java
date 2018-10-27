//package com.xlasers.api.util;
//
//import com.sun.javadoc.ClassDoc;
//import com.sun.javadoc.MethodDoc;
//import com.sun.javadoc.RootDoc;
//
///**
// * <p>
// *
// * </p>
// *
// * @package: com.xlasers.api.util
// * @author: Elijah.D
// * @time: CreateAt 2018/10/26 && 10:51
// * @description:
// * @copyright: Copyright © 2018 xlasers
// * @version: V1.0
// * @modified: Elijah.D
// */
//public class JavaDocReader {
//    private static RootDoc root;
//
//    public JavaDocReader() {
//
//    }
//
//    public static void show() {
//        ClassDoc[] classes = root.classes();
//        for (int i = 0; i < classes.length; ++i) {
//            System.out.println(classes[i]);
//            System.out.println(classes[i].commentText());
//            for (MethodDoc method : classes[i].methods()) {
//                System.out.printf("\t%s\n", method.commentText());
//            }
//        }
//    }
//
//    public static RootDoc getRoot() {
//        return root;
//    }
//
//    public static void main(String... args) throws Exception {
//        com.sun.tools.javadoc.Main.execute(new String[]{
//                        "-doclet", Doclet.class.getName(),
//                        "-encoding", "utf-8",
//                        "-classpath",
//                        "C:\\Users\\Solor\\Desktop\\Code\\future\\bravo-demos\\api\\target\\classes",
//                        "C:\\Users\\Solor\\Desktop\\Code\\future\\bravo-demos\\api\\src\\main\\java\\com\\xlasers\\api\\Api.java"
//                }
//        );
//        show();
//    }
//
//    public static class Doclet {
//        public Doclet() {
//        }
//
//        public static boolean start(RootDoc root) {
//            JavaDocReader.root = root;
//            return true;
//        }
//    }
//}
//

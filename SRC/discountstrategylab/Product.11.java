<?xml version="1.0" encoding="UTF-8"?>
<!--
*** GENERATED FROM project.xml - DO NOT EDIT  ***
***         EDIT ../build.xml INSTEAD         ***

For the purpose of easier reading the script
is divided into following sections:

  - initialization
  - compilation
  - jar
  - execution
  - debugging
  - javadoc
  - junit compilation
  - junit execution
  - junit debugging
  - applet
  - cleanup

        -->
<project xmlns:j2seproject1="http://www.netbeans.org/ns/j2se-project/1" xmlns:j2seproject3="http://www.netbeans.org/ns/j2se-project/3" xmlns:jaxrpc="http://www.netbeans.org/ns/j2se-project/jax-rpc" basedir=".." default="default" name="FindProduct-impl">
    <fail message="Please build using Ant 1.8.0 or higher.">
        <condition>
            <not>
                <antversion atleast="1.8.0"/>
            </not>
        </condition>
    </fail>
    <target depends="test,jar,javadoc" description="Build and test whole project." name="default"/>
    <!-- 
                ======================
                INITIALIZATION SECTION 
                ======================
            -->
    <target name="-pre-init">
        <!-- Empty placeholder for easier customization. -->
        <!-- You can override this target in the ../build.xml file. -->
    </target>
    <target depends="-pre-init" name="-init-private">
        <property file="nbproject/private/config.properties"/>
        <property file="nbproject/private/configs/${config}.properties"/>
        <property file="nbproject/private/private.properties"/>
    </target>
    <target depends="-pre-init,-init-private" name="-init-user">
        <property file="${user.properties.file}"/>
        <!-- The two properties below are usually overridden -->
        <!-- by the active platform. Just a fallback. -->
        <property name="default.jav
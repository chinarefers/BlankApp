FROM daocloud/ci-java:oraclejdk8
MAINTAINER lijy91@foxmail.com

# Update apt
RUN sudo dpkg --add-architecture i386
RUN sudo apt-get update

# Install tree
RUN sudo apt-get install -y tree

# Install wget
RUN sudo apt-get install -y wget

# Install ruby

# Install fir-cli

# Install Android SDK
RUN sudo apt-get -y install libncurses5:i386 libstdc++6:i386 zlib1g:i386
RUN wget http://dl.google.com/android/android-sdk_r24.3.4-linux.tgz
RUN tar xvzf android-sdk_r24.3.4-linux.tgz
RUN mv android-sdk-linux /usr/local/android-sdk

ENV ANDROID_HOME /usr/local/android-sdk
ENV PATH $PATH:$ANDROID_HOME/tools
ENV PATH $PATH:$ANDROID_HOME/platform-tools
ENV PATH $PATH:$ANDROID_HOME/build-tools/23.0.2

RUN android list sdk --all
RUN echo "y" | android update sdk --no-ui --force --filter platform-tools,tools,android-23,build-tools-23.0.2,sysimg-23,extra-android-m2repository,extra-google-m2repository,extra-android-support

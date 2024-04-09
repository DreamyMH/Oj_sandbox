package com.docker;

import com.github.dockerjava.core.DockerClientBuilder;

public class DockerDemo {
    DockerClient dockerClient = DockerClientBuilder.getInstance().build();
}

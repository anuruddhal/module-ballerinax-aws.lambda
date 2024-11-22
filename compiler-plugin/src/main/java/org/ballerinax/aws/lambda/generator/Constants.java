/*
 * Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerinax.aws.lambda.generator;

/**
 * Constants for Lambda Functions.
 */
public class Constants {

    public static final String LAMBDA_REG_FUNCTION_NAME = "__register";
    public static final String MAIN_FUNC_NAME = "main";
    public static final String LAMBDA_ORG_NAME = "ballerinax";
    public static final String AWS_ORG = "aws";
    public static final String LAMBDA_KEYWORD = "lambda";
    public static final String LAMBDA_MODULE_NAME = AWS_ORG + "." + LAMBDA_KEYWORD;
    public static final String LAMBDA_CONTEXT = "Context";
    public static final String CTX_PARAMS_NAME = "ctx";
    public static final String INPUT_PARAMS_NAME = "input";
    public static final String PROXY_FUNCTION_PREFIX = "__func_proxy__";
    public static final String LAMBDA_OUTPUT_ZIP_FILENAME = "aws-ballerina-lambda-functions.zip";
    public static final String AWS_LAMBDA_PREFIX = "aws-lamb";

    public static final String CONTAINER_OUTPUT_PATH = ":/app/build/output";

    public static final String DOCKER_PLATFORM_FLAG = "--platform";
    public static final String LAMBDA_REMOTE_COMPATIBLE_ARCHITECTURE = "linux/amd64";

    public static final String BALLERINA_ORG = "ballerina";
    public static final String NATIVE_BUILDER_IMAGE_NAME = "lambda_native_builder";
    public static final String BUILDER_TAG = "java21";
    public static final String NATIVE_BUILDER_IMAGE = BALLERINA_ORG + "/" + NATIVE_BUILDER_IMAGE_NAME +
            ":" + BUILDER_TAG;

    public static final String BOOTSTRAP_CONTENT = "#!/bin/sh\n" +
            "\n" +
            "set -euo pipefail\n" +
            "echo \"START Ballerina\"\n" +
            "echo \"HANDLER: ${_HANDLER}\"\n" +
            "$LAMBDA_TASK_ROOT/\"$(echo $_HANDLER | sed 's/\\.[^.]*$//')\"\n" +
            "echo \"END Ballerina\"\n";

    public static final String FUNCTION_DIRECTORY = "aws_lambda";
}

#
# OpenAI API
# APIs for sampling from and fine-tuning language models
# Version: 2.0.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

Describe -tag 'PSOpenAPITools' -name 'CreateCompletionRequest' {
    Context 'CreateCompletionRequest' {
        It 'Initialize-CreateCompletionRequest' {
            # a simple test to create an object
            #$NewObject = Initialize-CreateCompletionRequest -Model "TEST_VALUE" -Prompt "TEST_VALUE" -Suffix "TEST_VALUE" -MaxTokens "TEST_VALUE" -Temperature "TEST_VALUE" -TopP "TEST_VALUE" -N "TEST_VALUE" -Stream "TEST_VALUE" -Logprobs "TEST_VALUE" -Echo "TEST_VALUE" -Stop "TEST_VALUE" -PresencePenalty "TEST_VALUE" -FrequencyPenalty "TEST_VALUE" -BestOf "TEST_VALUE" -LogitBias "TEST_VALUE" -User "TEST_VALUE"
            #$NewObject | Should -BeOfType CreateCompletionRequest
            #$NewObject.property | Should -Be 0
        }
    }
}

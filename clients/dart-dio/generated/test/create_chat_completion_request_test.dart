import 'package:test/test.dart';
import 'package:openapi/openapi.dart';

// tests for CreateChatCompletionRequest
void main() {
  final instance = CreateChatCompletionRequestBuilder();
  // TODO add properties to the builder and call build()

  group(CreateChatCompletionRequest, () {
    // A list of messages comprising the conversation so far. [Example Python code](https://cookbook.openai.com/examples/how_to_format_inputs_to_chatgpt_models).
    // BuiltList<ChatCompletionRequestMessage> messages
    test('to test the property `messages`', () async {
      // TODO
    });

    // CreateChatCompletionRequestModel model
    test('to test the property `model`', () async {
      // TODO
    });

    // Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model's likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
    // num frequencyPenalty (default value: 0)
    test('to test the property `frequencyPenalty`', () async {
      // TODO
    });

    // Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the tokenizer) to an associated bias value from -100 to 100. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token. 
    // BuiltMap<String, int> logitBias
    test('to test the property `logitBias`', () async {
      // TODO
    });

    // Whether to return log probabilities of the output tokens or not. If true, returns the log probabilities of each output token returned in the `content` of `message`.
    // bool logprobs (default value: false)
    test('to test the property `logprobs`', () async {
      // TODO
    });

    // An integer between 0 and 20 specifying the number of most likely tokens to return at each token position, each with an associated log probability. `logprobs` must be set to `true` if this parameter is used.
    // int topLogprobs
    test('to test the property `topLogprobs`', () async {
      // TODO
    });

    // The maximum number of [tokens](/tokenizer) that can be generated in the chat completion.  The total length of input tokens and generated tokens is limited by the model's context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
    // int maxTokens
    test('to test the property `maxTokens`', () async {
      // TODO
    });

    // How many chat completion choices to generate for each input message. Note that you will be charged based on the number of generated tokens across all of the choices. Keep `n` as `1` to minimize costs.
    // int n (default value: 1)
    test('to test the property `n`', () async {
      // TODO
    });

    // Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model's likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
    // num presencePenalty (default value: 0)
    test('to test the property `presencePenalty`', () async {
      // TODO
    });

    // CreateChatCompletionRequestResponseFormat responseFormat
    test('to test the property `responseFormat`', () async {
      // TODO
    });

    // This feature is in Beta. If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same `seed` and parameters should return the same result. Determinism is not guaranteed, and you should refer to the `system_fingerprint` response parameter to monitor changes in the backend. 
    // int seed
    test('to test the property `seed`', () async {
      // TODO
    });

    // CreateChatCompletionRequestStop stop
    test('to test the property `stop`', () async {
      // TODO
    });

    // If set, partial message deltas will be sent, like in ChatGPT. Tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a `data: [DONE]` message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
    // bool stream (default value: false)
    test('to test the property `stream`', () async {
      // TODO
    });

    // What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
    // num temperature (default value: 1)
    test('to test the property `temperature`', () async {
      // TODO
    });

    // An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
    // num topP (default value: 1)
    test('to test the property `topP`', () async {
      // TODO
    });

    // A list of tools the model may call. Currently, only functions are supported as a tool. Use this to provide a list of functions the model may generate JSON inputs for. A max of 128 functions are supported. 
    // BuiltList<ChatCompletionTool> tools
    test('to test the property `tools`', () async {
      // TODO
    });

    // ChatCompletionToolChoiceOption toolChoice
    test('to test the property `toolChoice`', () async {
      // TODO
    });

    // A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    // String user
    test('to test the property `user`', () async {
      // TODO
    });

    // CreateChatCompletionRequestFunctionCall functionCall
    test('to test the property `functionCall`', () async {
      // TODO
    });

    // Deprecated in favor of `tools`.  A list of functions the model may generate JSON inputs for. 
    // BuiltList<ChatCompletionFunctions> functions
    test('to test the property `functions`', () async {
      // TODO
    });

  });
}

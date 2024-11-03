/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CreateCompletionRequest.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CreateCompletionRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CreateCompletionRequest_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "CppRestOpenAPIClient/model/CreateCompletionRequest_stop.h"
#include "CppRestOpenAPIClient/model/CreateCompletionRequest_model.h"
#include "CppRestOpenAPIClient/model/CreateCompletionRequest_prompt.h"
#include <map>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// 
/// </summary>
class  CreateCompletionRequest
    : public ModelBase
{
public:
    CreateCompletionRequest();
    virtual ~CreateCompletionRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CreateCompletionRequest members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateCompletionRequest_model> getModel() const;
    bool modelIsSet() const;
    void unsetModel();

    void setModel(const std::shared_ptr<CreateCompletionRequest_model>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateCompletionRequest_prompt> getPrompt() const;
    bool promptIsSet() const;
    void unsetPrompt();

    void setPrompt(const std::shared_ptr<CreateCompletionRequest_prompt>& value);

    /// <summary>
    /// Generates &#x60;best_of&#x60; completions server-side and returns the \&quot;best\&quot; (the one with the highest log probability per token). Results cannot be streamed.  When used with &#x60;n&#x60;, &#x60;best_of&#x60; controls the number of candidate completions and &#x60;n&#x60; specifies how many to return – &#x60;best_of&#x60; must be greater than &#x60;n&#x60;.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
    /// </summary>
    int32_t getBestOf() const;
    bool bestOfIsSet() const;
    void unsetBest_of();

    void setBestOf(int32_t value);

    /// <summary>
    /// Echo back the prompt in addition to the completion 
    /// </summary>
    bool isEcho() const;
    bool echoIsSet() const;
    void unsetEcho();

    void setEcho(bool value);

    /// <summary>
    /// Number between -2.0 and 2.0. Positive values penalize new tokens based on their existing frequency in the text so far, decreasing the model&#39;s likelihood to repeat the same line verbatim.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
    /// </summary>
    double getFrequencyPenalty() const;
    bool frequencyPenaltyIsSet() const;
    void unsetFrequency_penalty();

    void setFrequencyPenalty(double value);

    /// <summary>
    /// Modify the likelihood of specified tokens appearing in the completion.  Accepts a JSON object that maps tokens (specified by their token ID in the GPT tokenizer) to an associated bias value from -100 to 100. You can use this [tokenizer tool](/tokenizer?view&#x3D;bpe) to convert text to token IDs. Mathematically, the bias is added to the logits generated by the model prior to sampling. The exact effect will vary per model, but values between -1 and 1 should decrease or increase likelihood of selection; values like -100 or 100 should result in a ban or exclusive selection of the relevant token.  As an example, you can pass &#x60;{\&quot;50256\&quot;: -100}&#x60; to prevent the &lt;|endoftext|&gt; token from being generated. 
    /// </summary>
    std::map<utility::string_t, int32_t>& getLogitBias();
    bool logitBiasIsSet() const;
    void unsetLogit_bias();

    void setLogitBias(std::map<utility::string_t, int32_t> value);

    /// <summary>
    /// Include the log probabilities on the &#x60;logprobs&#x60; most likely output tokens, as well the chosen tokens. For example, if &#x60;logprobs&#x60; is 5, the API will return a list of the 5 most likely tokens. The API will always return the &#x60;logprob&#x60; of the sampled token, so there may be up to &#x60;logprobs+1&#x60; elements in the response.  The maximum value for &#x60;logprobs&#x60; is 5. 
    /// </summary>
    int32_t getLogprobs() const;
    bool logprobsIsSet() const;
    void unsetLogprobs();

    void setLogprobs(int32_t value);

    /// <summary>
    /// The maximum number of [tokens](/tokenizer) that can be generated in the completion.  The token count of your prompt plus &#x60;max_tokens&#x60; cannot exceed the model&#39;s context length. [Example Python code](https://cookbook.openai.com/examples/how_to_count_tokens_with_tiktoken) for counting tokens. 
    /// </summary>
    int32_t getMaxTokens() const;
    bool maxTokensIsSet() const;
    void unsetMax_tokens();

    void setMaxTokens(int32_t value);

    /// <summary>
    /// How many completions to generate for each prompt.  **Note:** Because this parameter generates many completions, it can quickly consume your token quota. Use carefully and ensure that you have reasonable settings for &#x60;max_tokens&#x60; and &#x60;stop&#x60;. 
    /// </summary>
    int32_t getN() const;
    bool NIsSet() const;
    void unsetn();

    void setN(int32_t value);

    /// <summary>
    /// Number between -2.0 and 2.0. Positive values penalize new tokens based on whether they appear in the text so far, increasing the model&#39;s likelihood to talk about new topics.  [See more information about frequency and presence penalties.](/docs/guides/text-generation/parameter-details) 
    /// </summary>
    double getPresencePenalty() const;
    bool presencePenaltyIsSet() const;
    void unsetPresence_penalty();

    void setPresencePenalty(double value);

    /// <summary>
    /// If specified, our system will make a best effort to sample deterministically, such that repeated requests with the same &#x60;seed&#x60; and parameters should return the same result.  Determinism is not guaranteed, and you should refer to the &#x60;system_fingerprint&#x60; response parameter to monitor changes in the backend. 
    /// </summary>
    int32_t getSeed() const;
    bool seedIsSet() const;
    void unsetSeed();

    void setSeed(int32_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CreateCompletionRequest_stop> getStop() const;
    bool stopIsSet() const;
    void unsetStop();

    void setStop(const std::shared_ptr<CreateCompletionRequest_stop>& value);

    /// <summary>
    /// Whether to stream back partial progress. If set, tokens will be sent as data-only [server-sent events](https://developer.mozilla.org/en-US/docs/Web/API/Server-sent_events/Using_server-sent_events#Event_stream_format) as they become available, with the stream terminated by a &#x60;data: [DONE]&#x60; message. [Example Python code](https://cookbook.openai.com/examples/how_to_stream_completions). 
    /// </summary>
    bool isStream() const;
    bool streamIsSet() const;
    void unsetStream();

    void setStream(bool value);

    /// <summary>
    /// The suffix that comes after a completion of inserted text.  This parameter is only supported for &#x60;gpt-3.5-turbo-instruct&#x60;. 
    /// </summary>
    utility::string_t getSuffix() const;
    bool suffixIsSet() const;
    void unsetSuffix();

    void setSuffix(const utility::string_t& value);

    /// <summary>
    /// What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or &#x60;top_p&#x60; but not both. 
    /// </summary>
    double getTemperature() const;
    bool temperatureIsSet() const;
    void unsetTemperature();

    void setTemperature(double value);

    /// <summary>
    /// An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or &#x60;temperature&#x60; but not both. 
    /// </summary>
    double getTopP() const;
    bool topPIsSet() const;
    void unsetTop_p();

    void setTopP(double value);

    /// <summary>
    /// A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
    /// </summary>
    utility::string_t getUser() const;
    bool userIsSet() const;
    void unsetUser();

    void setUser(const utility::string_t& value);


protected:
    std::shared_ptr<CreateCompletionRequest_model> m_Model;
    bool m_ModelIsSet;
    std::shared_ptr<CreateCompletionRequest_prompt> m_Prompt;
    bool m_PromptIsSet;
    int32_t m_Best_of;
    bool m_Best_ofIsSet;
    bool m_Echo;
    bool m_EchoIsSet;
    double m_Frequency_penalty;
    bool m_Frequency_penaltyIsSet;
    std::map<utility::string_t, int32_t> m_Logit_bias;
    bool m_Logit_biasIsSet;
    int32_t m_Logprobs;
    bool m_LogprobsIsSet;
    int32_t m_Max_tokens;
    bool m_Max_tokensIsSet;
    int32_t m_n;
    bool m_nIsSet;
    double m_Presence_penalty;
    bool m_Presence_penaltyIsSet;
    int32_t m_Seed;
    bool m_SeedIsSet;
    std::shared_ptr<CreateCompletionRequest_stop> m_Stop;
    bool m_StopIsSet;
    bool m_Stream;
    bool m_StreamIsSet;
    utility::string_t m_Suffix;
    bool m_SuffixIsSet;
    double m_Temperature;
    bool m_TemperatureIsSet;
    double m_Top_p;
    bool m_Top_pIsSet;
    utility::string_t m_User;
    bool m_UserIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CreateCompletionRequest_H_ */

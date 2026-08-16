
/*
 * UsageCompletionsResult.h
 *
 * The aggregated completions usage details of the specific time bucket.
 */

#ifndef TINY_CPP_CLIENT_UsageCompletionsResult_H_
#define TINY_CPP_CLIENT_UsageCompletionsResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The aggregated completions usage details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class UsageCompletionsResult{
public:

    /*! \brief Constructor.
	 */
    UsageCompletionsResult();
    UsageCompletionsResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UsageCompletionsResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
	 */
	int getInputTokens();

	/*! \brief Set The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
	 */
	void setInputTokens(int  input_tokens);
	/*! \brief Get The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
	 */
	int getInputCachedTokens();

	/*! \brief Set The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
	 */
	void setInputCachedTokens(int  input_cached_tokens);
	/*! \brief Get The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
	 */
	int getOutputTokens();

	/*! \brief Set The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
	 */
	void setOutputTokens(int  output_tokens);
	/*! \brief Get The aggregated number of audio input tokens used, including cached tokens.
	 */
	int getInputAudioTokens();

	/*! \brief Set The aggregated number of audio input tokens used, including cached tokens.
	 */
	void setInputAudioTokens(int  input_audio_tokens);
	/*! \brief Get The aggregated number of audio output tokens used.
	 */
	int getOutputAudioTokens();

	/*! \brief Set The aggregated number of audio output tokens used.
	 */
	void setOutputAudioTokens(int  output_audio_tokens);
	/*! \brief Get The count of requests made to the model.
	 */
	int getNumModelRequests();

	/*! \brief Set The count of requests made to the model.
	 */
	void setNumModelRequests(int  num_model_requests);
	/*! \brief Get When `group_by=project_id`, this field provides the project ID of the grouped usage result.
	 */
	std::string getProjectId();

	/*! \brief Set When `group_by=project_id`, this field provides the project ID of the grouped usage result.
	 */
	void setProjectId(std::string  project_id);
	/*! \brief Get When `group_by=user_id`, this field provides the user ID of the grouped usage result.
	 */
	std::string getUserId();

	/*! \brief Set When `group_by=user_id`, this field provides the user ID of the grouped usage result.
	 */
	void setUserId(std::string  user_id);
	/*! \brief Get When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
	 */
	std::string getApiKeyId();

	/*! \brief Set When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
	 */
	void setApiKeyId(std::string  api_key_id);
	/*! \brief Get When `group_by=model`, this field provides the model name of the grouped usage result.
	 */
	std::string getModel();

	/*! \brief Set When `group_by=model`, this field provides the model name of the grouped usage result.
	 */
	void setModel(std::string  model);
	/*! \brief Get When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
	 */
	bool isBatch();

	/*! \brief Set When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
	 */
	void setBatch(bool  batch);


    private:
    std::string object{};
    int input_tokens{};
    int input_cached_tokens{};
    int output_tokens{};
    int input_audio_tokens{};
    int output_audio_tokens{};
    int num_model_requests{};
    std::string project_id{};
    std::string user_id{};
    std::string api_key_id{};
    std::string model{};
    bool batch{};
};
}

#endif /* TINY_CPP_CLIENT_UsageCompletionsResult_H_ */

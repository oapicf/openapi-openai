/*
 * UsageTimeBucket_result_inner.h
 *
 * 
 */

#ifndef _UsageTimeBucket_result_inner_H_
#define _UsageTimeBucket_result_inner_H_


#include <string>
#include "CostsResult.h"
#include "CostsResult_amount.h"
#include "UsageAudioSpeechesResult.h"
#include "UsageAudioTranscriptionsResult.h"
#include "UsageCodeInterpreterSessionsResult.h"
#include "UsageCompletionsResult.h"
#include "UsageEmbeddingsResult.h"
#include "UsageImagesResult.h"
#include "UsageModerationsResult.h"
#include "UsageVectorStoresResult.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UsageTimeBucket_result_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	UsageTimeBucket_result_inner();
	UsageTimeBucket_result_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsageTimeBucket_result_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get The aggregated number of input tokens used.
	 */
	int getInputTokens();

	/*! \brief Set The aggregated number of input tokens used.
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
	/*! \brief Get When `group_by=project_id`, this field provides the project ID of the grouped costs result.
	 */
	std::string getProjectId();

	/*! \brief Set When `group_by=project_id`, this field provides the project ID of the grouped costs result.
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
	bool getBatch();

	/*! \brief Set When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
	 */
	void setBatch(bool  batch);
	/*! \brief Get The number of images processed.
	 */
	int getImages();

	/*! \brief Set The number of images processed.
	 */
	void setImages(int  images);
	/*! \brief Get When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
	 */
	std::string getSource();

	/*! \brief Set When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
	 */
	void setSource(std::string  source);
	/*! \brief Get When `group_by=size`, this field provides the image size of the grouped usage result.
	 */
	std::string getSize();

	/*! \brief Set When `group_by=size`, this field provides the image size of the grouped usage result.
	 */
	void setSize(std::string  size);
	/*! \brief Get The number of characters processed.
	 */
	int getCharacters();

	/*! \brief Set The number of characters processed.
	 */
	void setCharacters(int  characters);
	/*! \brief Get The number of seconds processed.
	 */
	int getSeconds();

	/*! \brief Set The number of seconds processed.
	 */
	void setSeconds(int  seconds);
	/*! \brief Get The vector stores usage in bytes.
	 */
	int getUsageBytes();

	/*! \brief Set The vector stores usage in bytes.
	 */
	void setUsageBytes(int  usage_bytes);
	/*! \brief Get The number of code interpreter sessions.
	 */
	int getSessions();

	/*! \brief Set The number of code interpreter sessions.
	 */
	void setSessions(int  sessions);
	/*! \brief Get 
	 */
	CostsResult_amount getAmount();

	/*! \brief Set 
	 */
	void setAmount(CostsResult_amount  amount);
	/*! \brief Get When `group_by=line_item`, this field provides the line item of the grouped costs result.
	 */
	std::string getLineItem();

	/*! \brief Set When `group_by=line_item`, this field provides the line item of the grouped costs result.
	 */
	void setLineItem(std::string  line_item);

private:
	std::string object;
	int input_tokens;
	int input_cached_tokens;
	int output_tokens;
	int input_audio_tokens;
	int output_audio_tokens;
	int num_model_requests;
	std::string project_id;
	std::string user_id;
	std::string api_key_id;
	std::string model;
	bool batch;
	int images;
	std::string source;
	std::string size;
	int characters;
	int seconds;
	int usage_bytes;
	int sessions;
	CostsResult_amount amount;
	std::string line_item;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UsageTimeBucket_result_inner_H_ */

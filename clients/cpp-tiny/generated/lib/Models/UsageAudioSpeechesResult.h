
/*
 * UsageAudioSpeechesResult.h
 *
 * The aggregated audio speeches usage details of the specific time bucket.
 */

#ifndef TINY_CPP_CLIENT_UsageAudioSpeechesResult_H_
#define TINY_CPP_CLIENT_UsageAudioSpeechesResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The aggregated audio speeches usage details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class UsageAudioSpeechesResult{
public:

    /*! \brief Constructor.
	 */
    UsageAudioSpeechesResult();
    UsageAudioSpeechesResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UsageAudioSpeechesResult();


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
	/*! \brief Get The number of characters processed.
	 */
	int getCharacters();

	/*! \brief Set The number of characters processed.
	 */
	void setCharacters(int  characters);
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


    private:
    std::string object{};
    int characters{};
    int num_model_requests{};
    std::string project_id{};
    std::string user_id{};
    std::string api_key_id{};
    std::string model{};
};
}

#endif /* TINY_CPP_CLIENT_UsageAudioSpeechesResult_H_ */

/*
 * UsageImagesResult.h
 *
 * The aggregated images usage details of the specific time bucket.
 */

#ifndef _UsageImagesResult_H_
#define _UsageImagesResult_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The aggregated images usage details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class UsageImagesResult : public Object {
public:
	/*! \brief Constructor.
	 */
	UsageImagesResult();
	UsageImagesResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsageImagesResult();

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
	/*! \brief Get The number of images processed.
	 */
	int getImages();

	/*! \brief Set The number of images processed.
	 */
	void setImages(int  images);
	/*! \brief Get The count of requests made to the model.
	 */
	int getNumModelRequests();

	/*! \brief Set The count of requests made to the model.
	 */
	void setNumModelRequests(int  num_model_requests);
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
	std::string object;
	int images;
	int num_model_requests;
	std::string source;
	std::string size;
	std::string project_id;
	std::string user_id;
	std::string api_key_id;
	std::string model;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UsageImagesResult_H_ */

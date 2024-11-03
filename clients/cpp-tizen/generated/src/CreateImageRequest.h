/*
 * CreateImageRequest.h
 *
 * 
 */

#ifndef _CreateImageRequest_H_
#define _CreateImageRequest_H_


#include <string>
#include "CreateImageRequest_model.h"
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

class CreateImageRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateImageRequest();
	CreateImageRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateImageRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
	 */
	std::string getPrompt();

	/*! \brief Set A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
	 */
	void setPrompt(std::string  prompt);
	/*! \brief Get 
	 */
	CreateImageRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateImageRequest_model  model);
	/*! \brief Get The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
	 */
	int getN();

	/*! \brief Set The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
	 */
	void setN(int  n);
	/*! \brief Get The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
	 */
	std::string getQuality();

	/*! \brief Set The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
	 */
	void setQuality(std::string  quality);
	/*! \brief Get The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
	 */
	std::string getResponseFormat();

	/*! \brief Set The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
	 */
	void setResponseFormat(std::string  response_format);
	/*! \brief Get The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
	 */
	std::string getSize();

	/*! \brief Set The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
	 */
	void setSize(std::string  size);
	/*! \brief Get The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
	 */
	std::string getStyle();

	/*! \brief Set The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
	 */
	void setStyle(std::string  style);
	/*! \brief Get A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	std::string getUser();

	/*! \brief Set A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	void setUser(std::string  user);

private:
	std::string prompt;
	CreateImageRequest_model model;
	int n;
	std::string quality;
	std::string response_format;
	std::string size;
	std::string style;
	std::string user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateImageRequest_H_ */

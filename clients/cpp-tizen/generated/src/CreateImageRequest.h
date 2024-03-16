/*
 * CreateImageRequest.h
 *
 * 
 */

#ifndef _CreateImageRequest_H_
#define _CreateImageRequest_H_


#include <string>
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

	/*! \brief Get A text description of the desired image(s). The maximum length is 1000 characters.
	 */
	std::string getPrompt();

	/*! \brief Set A text description of the desired image(s). The maximum length is 1000 characters.
	 */
	void setPrompt(std::string  prompt);
	/*! \brief Get The number of images to generate. Must be between 1 and 10.
	 */
	int getN();

	/*! \brief Set The number of images to generate. Must be between 1 and 10.
	 */
	void setN(int  n);
	/*! \brief Get The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
	 */
	std::string getSize();

	/*! \brief Set The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
	 */
	void setSize(std::string  size);
	/*! \brief Get The format in which the generated images are returned. Must be one of `url` or `b64_json`.
	 */
	std::string getResponseFormat();

	/*! \brief Set The format in which the generated images are returned. Must be one of `url` or `b64_json`.
	 */
	void setResponseFormat(std::string  response_format);
	/*! \brief Get A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	std::string getUser();

	/*! \brief Set A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
	 */
	void setUser(std::string  user);

private:
	std::string prompt;
	int n;
	std::string size;
	std::string response_format;
	std::string user;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateImageRequest_H_ */

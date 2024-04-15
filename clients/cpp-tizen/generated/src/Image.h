/*
 * Image.h
 *
 * Represents the url or the content of an image generated by the OpenAI API.
 */

#ifndef _Image_H_
#define _Image_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents the url or the content of an image generated by the OpenAI API.
 *
 *  \ingroup Models
 *
 */

class Image : public Object {
public:
	/*! \brief Constructor.
	 */
	Image();
	Image(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Image();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
	 */
	std::string getB64Json();

	/*! \brief Set The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.
	 */
	void setB64Json(std::string  b64_json);
	/*! \brief Get The URL of the generated image, if `response_format` is `url` (default).
	 */
	std::string getUrl();

	/*! \brief Set The URL of the generated image, if `response_format` is `url` (default).
	 */
	void setUrl(std::string  url);
	/*! \brief Get The prompt that was used to generate the image, if there was any revision to the prompt.
	 */
	std::string getRevisedPrompt();

	/*! \brief Set The prompt that was used to generate the image, if there was any revision to the prompt.
	 */
	void setRevisedPrompt(std::string  revised_prompt);

private:
	std::string b64_json;
	std::string url;
	std::string revised_prompt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Image_H_ */
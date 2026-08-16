
/*
 * ChatCompletionRequestMessageContentPartImage_image_url.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartImage_image_url_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartImage_image_url_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartImage_image_url{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestMessageContentPartImage_image_url();
    ChatCompletionRequestMessageContentPartImage_image_url(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestMessageContentPartImage_image_url();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Either a URL of the image or the base64 encoded image data.
	 */
	std::string getUrl();

	/*! \brief Set Either a URL of the image or the base64 encoded image data.
	 */
	void setUrl(std::string  url);
	/*! \brief Get Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
	 */
	std::string getDetail();

	/*! \brief Set Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
	 */
	void setDetail(std::string  detail);


    private:
    std::string url{};
    std::string detail{};
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartImage_image_url_H_ */

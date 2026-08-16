
/*
 * ChatCompletionRequestMessageContentPartImage.h
 *
 * Learn about [image inputs](/docs/guides/vision). 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartImage_H_
#define TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartImage_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionRequestMessageContentPartImage_image_url.h"

namespace Tiny {


/*! \brief Learn about [image inputs](/docs/guides/vision). 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionRequestMessageContentPartImage{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionRequestMessageContentPartImage();
    ChatCompletionRequestMessageContentPartImage(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionRequestMessageContentPartImage();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The type of the content part.
	 */
	std::string getType();

	/*! \brief Set The type of the content part.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ChatCompletionRequestMessageContentPartImage_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(ChatCompletionRequestMessageContentPartImage_image_url  image_url);


    private:
    std::string type{};
    ChatCompletionRequestMessageContentPartImage_image_url image_url;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionRequestMessageContentPartImage_H_ */

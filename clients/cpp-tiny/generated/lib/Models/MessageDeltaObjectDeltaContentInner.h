
/*
 * MessageDeltaObject_delta_content_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MessageDeltaObject_delta_content_inner_H_
#define TINY_CPP_CLIENT_MessageDeltaObject_delta_content_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageDeltaContentImageFileObject.h"
#include "MessageDeltaContentImageFileObject_image_file.h"
#include "MessageDeltaContentImageUrlObject.h"
#include "MessageDeltaContentImageUrlObject_image_url.h"
#include "MessageDeltaContentRefusalObject.h"
#include "MessageDeltaContentTextObject.h"
#include "MessageDeltaContentTextObject_text.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MessageDeltaObject_delta_content_inner{
public:

    /*! \brief Constructor.
	 */
    MessageDeltaObject_delta_content_inner();
    MessageDeltaObject_delta_content_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MessageDeltaObject_delta_content_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The index of the content part in the message.
	 */
	int getIndex();

	/*! \brief Set The index of the content part in the message.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `image_file`.
	 */
	std::string getType();

	/*! \brief Set Always `image_file`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageDeltaContentImageFileObject_image_file getImageFile();

	/*! \brief Set 
	 */
	void setImageFile(MessageDeltaContentImageFileObject_image_file  image_file);
	/*! \brief Get 
	 */
	MessageDeltaContentTextObject_text getText();

	/*! \brief Set 
	 */
	void setText(MessageDeltaContentTextObject_text  text);
	/*! \brief Get 
	 */
	std::string getRefusal();

	/*! \brief Set 
	 */
	void setRefusal(std::string  refusal);
	/*! \brief Get 
	 */
	MessageDeltaContentImageUrlObject_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(MessageDeltaContentImageUrlObject_image_url  image_url);


    private:
    int index{};
    std::string type{};
    MessageDeltaContentImageFileObject_image_file image_file;
    MessageDeltaContentTextObject_text text;
    std::string refusal{};
    MessageDeltaContentImageUrlObject_image_url image_url;
};
}

#endif /* TINY_CPP_CLIENT_MessageDeltaObject_delta_content_inner_H_ */

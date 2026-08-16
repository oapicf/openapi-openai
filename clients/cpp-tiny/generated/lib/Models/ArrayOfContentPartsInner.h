
/*
 * Array_of_content_parts_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_Array_of_content_parts_inner_H_
#define TINY_CPP_CLIENT_Array_of_content_parts_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MessageContentImageFileObject.h"
#include "MessageContentImageFileObject_image_file.h"
#include "MessageContentImageUrlObject.h"
#include "MessageContentImageUrlObject_image_url.h"
#include "MessageRequestContentTextObject.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class Array_of_content_parts_inner{
public:

    /*! \brief Constructor.
	 */
    Array_of_content_parts_inner();
    Array_of_content_parts_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~Array_of_content_parts_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Always `image_file`.
	 */
	std::string getType();

	/*! \brief Set Always `image_file`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	MessageContentImageFileObject_image_file getImageFile();

	/*! \brief Set 
	 */
	void setImageFile(MessageContentImageFileObject_image_file  image_file);
	/*! \brief Get 
	 */
	MessageContentImageUrlObject_image_url getImageUrl();

	/*! \brief Set 
	 */
	void setImageUrl(MessageContentImageUrlObject_image_url  image_url);
	/*! \brief Get Text content to be sent to the model
	 */
	std::string getText();

	/*! \brief Set Text content to be sent to the model
	 */
	void setText(std::string  text);


    private:
    std::string type{};
    MessageContentImageFileObject_image_file image_file;
    MessageContentImageUrlObject_image_url image_url;
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_Array_of_content_parts_inner_H_ */

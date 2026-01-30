/*
 * Array_of_content_parts_inner.h
 *
 * 
 */

#ifndef _Array_of_content_parts_inner_H_
#define _Array_of_content_parts_inner_H_


#include <string>
#include "MessageContentImageFileObject.h"
#include "MessageContentImageFileObject_image_file.h"
#include "MessageContentImageUrlObject.h"
#include "MessageContentImageUrlObject_image_url.h"
#include "MessageRequestContentTextObject.h"
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

class Array_of_content_parts_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	Array_of_content_parts_inner();
	Array_of_content_parts_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Array_of_content_parts_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string type;
	MessageContentImageFileObject_image_file image_file;
	MessageContentImageUrlObject_image_url image_url;
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Array_of_content_parts_inner_H_ */

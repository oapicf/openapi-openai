/*
 * MessageObject_content_inner.h
 *
 * 
 */

#ifndef _MessageObject_content_inner_H_
#define _MessageObject_content_inner_H_


#include <string>
#include "MessageContentImageFileObject.h"
#include "MessageContentImageFileObject_image_file.h"
#include "MessageContentImageUrlObject.h"
#include "MessageContentImageUrlObject_image_url.h"
#include "MessageContentRefusalObject.h"
#include "MessageContentTextObject.h"
#include "MessageContentTextObject_text.h"
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

class MessageObject_content_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageObject_content_inner();
	MessageObject_content_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageObject_content_inner();

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
	/*! \brief Get 
	 */
	MessageContentTextObject_text getText();

	/*! \brief Set 
	 */
	void setText(MessageContentTextObject_text  text);
	/*! \brief Get 
	 */
	std::string getRefusal();

	/*! \brief Set 
	 */
	void setRefusal(std::string  refusal);

private:
	std::string type;
	MessageContentImageFileObject_image_file image_file;
	MessageContentImageUrlObject_image_url image_url;
	MessageContentTextObject_text text;
	std::string refusal;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageObject_content_inner_H_ */

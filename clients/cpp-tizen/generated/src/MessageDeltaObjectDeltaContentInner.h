/*
 * MessageDeltaObject_delta_content_inner.h
 *
 * 
 */

#ifndef _MessageDeltaObject_delta_content_inner_H_
#define _MessageDeltaObject_delta_content_inner_H_


#include <string>
#include "MessageDeltaContentImageFileObject.h"
#include "MessageDeltaContentImageFileObject_image_file.h"
#include "MessageDeltaContentTextObject.h"
#include "MessageDeltaContentTextObject_text.h"
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

class MessageDeltaObject_delta_content_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaObject_delta_content_inner();
	MessageDeltaObject_delta_content_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaObject_delta_content_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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

private:
	int index;
	std::string type;
	MessageDeltaContentImageFileObject_image_file image_file;
	MessageDeltaContentTextObject_text text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaObject_delta_content_inner_H_ */

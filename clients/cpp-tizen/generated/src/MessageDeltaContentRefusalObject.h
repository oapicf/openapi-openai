/*
 * MessageDeltaContentRefusalObject.h
 *
 * The refusal content that is part of a message.
 */

#ifndef _MessageDeltaContentRefusalObject_H_
#define _MessageDeltaContentRefusalObject_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The refusal content that is part of a message.
 *
 *  \ingroup Models
 *
 */

class MessageDeltaContentRefusalObject : public Object {
public:
	/*! \brief Constructor.
	 */
	MessageDeltaContentRefusalObject();
	MessageDeltaContentRefusalObject(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MessageDeltaContentRefusalObject();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The index of the refusal part in the message.
	 */
	int getIndex();

	/*! \brief Set The index of the refusal part in the message.
	 */
	void setIndex(int  index);
	/*! \brief Get Always `refusal`.
	 */
	std::string getType();

	/*! \brief Set Always `refusal`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	std::string getRefusal();

	/*! \brief Set 
	 */
	void setRefusal(std::string  refusal);

private:
	int index;
	std::string type;
	std::string refusal;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MessageDeltaContentRefusalObject_H_ */

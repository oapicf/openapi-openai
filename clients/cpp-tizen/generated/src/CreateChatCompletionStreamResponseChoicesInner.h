/*
 * CreateChatCompletionStreamResponse_choices_inner.h
 *
 * 
 */

#ifndef _CreateChatCompletionStreamResponse_choices_inner_H_
#define _CreateChatCompletionStreamResponse_choices_inner_H_


#include <string>
#include "ChatCompletionStreamResponseDelta.h"
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

class CreateChatCompletionStreamResponse_choices_inner : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateChatCompletionStreamResponse_choices_inner();
	CreateChatCompletionStreamResponse_choices_inner(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateChatCompletionStreamResponse_choices_inner();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getIndex();

	/*! \brief Set 
	 */
	void setIndex(int  index);
	/*! \brief Get 
	 */
	ChatCompletionStreamResponseDelta getDelta();

	/*! \brief Set 
	 */
	void setDelta(ChatCompletionStreamResponseDelta  delta);
	/*! \brief Get 
	 */
	std::string getFinishReason();

	/*! \brief Set 
	 */
	void setFinishReason(std::string  finish_reason);

private:
	int index;
	ChatCompletionStreamResponseDelta delta;
	std::string finish_reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateChatCompletionStreamResponse_choices_inner_H_ */

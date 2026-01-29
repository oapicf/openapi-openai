/*
 * ChatCompletionMessageToolCallChunk.h
 *
 * 
 */

#ifndef _ChatCompletionMessageToolCallChunk_H_
#define _ChatCompletionMessageToolCallChunk_H_


#include <string>
#include "ChatCompletionMessageToolCallChunk_function.h"
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

class ChatCompletionMessageToolCallChunk : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionMessageToolCallChunk();
	ChatCompletionMessageToolCallChunk(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionMessageToolCallChunk();

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
	/*! \brief Get The ID of the tool call.
	 */
	std::string getId();

	/*! \brief Set The ID of the tool call.
	 */
	void setId(std::string  id);
	/*! \brief Get The type of the tool. Currently, only `function` is supported.
	 */
	std::string getType();

	/*! \brief Set The type of the tool. Currently, only `function` is supported.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	ChatCompletionMessageToolCallChunk_function getFunction();

	/*! \brief Set 
	 */
	void setFunction(ChatCompletionMessageToolCallChunk_function  function);

private:
	int index;
	std::string id;
	std::string type;
	ChatCompletionMessageToolCallChunk_function function;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionMessageToolCallChunk_H_ */

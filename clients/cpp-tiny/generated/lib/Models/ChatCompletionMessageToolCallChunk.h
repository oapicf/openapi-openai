
/*
 * ChatCompletionMessageToolCallChunk.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionMessageToolCallChunk_H_
#define TINY_CPP_CLIENT_ChatCompletionMessageToolCallChunk_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionMessageToolCallChunk_function.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionMessageToolCallChunk{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionMessageToolCallChunk();
    ChatCompletionMessageToolCallChunk(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionMessageToolCallChunk();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    int index{};
    std::string id{};
    std::string type{};
    ChatCompletionMessageToolCallChunk_function function;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionMessageToolCallChunk_H_ */

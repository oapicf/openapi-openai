/*
 * ChatCompletionTokenLogprob.h
 *
 * 
 */

#ifndef _ChatCompletionTokenLogprob_H_
#define _ChatCompletionTokenLogprob_H_


#include <string>
#include "ChatCompletionTokenLogprob_top_logprobs_inner.h"
#include <list>
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

class ChatCompletionTokenLogprob : public Object {
public:
	/*! \brief Constructor.
	 */
	ChatCompletionTokenLogprob();
	ChatCompletionTokenLogprob(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChatCompletionTokenLogprob();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The token.
	 */
	std::string getToken();

	/*! \brief Set The token.
	 */
	void setToken(std::string  token);
	/*! \brief Get The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
	 */
	long long getLogprob();

	/*! \brief Set The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
	 */
	void setLogprob(long long  logprob);
	/*! \brief Get A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
	 */
	std::list<int> getBytes();

	/*! \brief Set A list of integers representing the UTF-8 bytes representation of the token. Useful in instances where characters are represented by multiple tokens and their byte representations must be combined to generate the correct text representation. Can be `null` if there is no bytes representation for the token.
	 */
	void setBytes(std::list <int> bytes);
	/*! \brief Get List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
	 */
	std::list<ChatCompletionTokenLogprob_top_logprobs_inner> getTopLogprobs();

	/*! \brief Set List of the most likely tokens and their log probability, at this token position. In rare cases, there may be fewer than the number of requested `top_logprobs` returned.
	 */
	void setTopLogprobs(std::list <ChatCompletionTokenLogprob_top_logprobs_inner> top_logprobs);

private:
	std::string token;
	long long logprob;
	std::list <int>bytes;
	std::list <ChatCompletionTokenLogprob_top_logprobs_inner>top_logprobs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChatCompletionTokenLogprob_H_ */

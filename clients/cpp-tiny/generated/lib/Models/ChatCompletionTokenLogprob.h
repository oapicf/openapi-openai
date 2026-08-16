
/*
 * ChatCompletionTokenLogprob.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ChatCompletionTokenLogprob_H_
#define TINY_CPP_CLIENT_ChatCompletionTokenLogprob_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ChatCompletionTokenLogprob_top_logprobs_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ChatCompletionTokenLogprob{
public:

    /*! \brief Constructor.
	 */
    ChatCompletionTokenLogprob();
    ChatCompletionTokenLogprob(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ChatCompletionTokenLogprob();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The token.
	 */
	std::string getToken();

	/*! \brief Set The token.
	 */
	void setToken(std::string  token);
	/*! \brief Get The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
	 */
	long getLogprob();

	/*! \brief Set The log probability of this token, if it is within the top 20 most likely tokens. Otherwise, the value `-9999.0` is used to signify that the token is very unlikely.
	 */
	void setLogprob(long  logprob);
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
    std::string token{};
    long logprob{};
    std::list<int> bytes;
    std::list<ChatCompletionTokenLogprob_top_logprobs_inner> top_logprobs;
};
}

#endif /* TINY_CPP_CLIENT_ChatCompletionTokenLogprob_H_ */

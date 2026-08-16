
/*
 * TranscriptionWord.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_TranscriptionWord_H_
#define TINY_CPP_CLIENT_TranscriptionWord_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class TranscriptionWord{
public:

    /*! \brief Constructor.
	 */
    TranscriptionWord();
    TranscriptionWord(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~TranscriptionWord();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The text content of the word.
	 */
	std::string getWord();

	/*! \brief Set The text content of the word.
	 */
	void setWord(std::string  word);
	/*! \brief Get Start time of the word in seconds.
	 */
	float getStart();

	/*! \brief Set Start time of the word in seconds.
	 */
	void setStart(float  start);
	/*! \brief Get End time of the word in seconds.
	 */
	float getEnd();

	/*! \brief Set End time of the word in seconds.
	 */
	void setEnd(float  end);


    private:
    std::string word{};
    float start{};
    float end{};
};
}

#endif /* TINY_CPP_CLIENT_TranscriptionWord_H_ */

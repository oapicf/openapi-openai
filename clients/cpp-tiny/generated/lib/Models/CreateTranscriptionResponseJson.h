
/*
 * CreateTranscriptionResponseJson.h
 *
 * Represents a transcription response returned by model, based on the provided input.
 */

#ifndef TINY_CPP_CLIENT_CreateTranscriptionResponseJson_H_
#define TINY_CPP_CLIENT_CreateTranscriptionResponseJson_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Represents a transcription response returned by model, based on the provided input.
 *
 *  \ingroup Models
 *
 */

class CreateTranscriptionResponseJson{
public:

    /*! \brief Constructor.
	 */
    CreateTranscriptionResponseJson();
    CreateTranscriptionResponseJson(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateTranscriptionResponseJson();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The transcribed text.
	 */
	std::string getText();

	/*! \brief Set The transcribed text.
	 */
	void setText(std::string  text);


    private:
    std::string text{};
};
}

#endif /* TINY_CPP_CLIENT_CreateTranscriptionResponseJson_H_ */

/*
 * CreateEditRequest.h
 *
 * 
 */

#ifndef _CreateEditRequest_H_
#define _CreateEditRequest_H_


#include <string>
#include "CreateEditRequest_model.h"
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

class CreateEditRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEditRequest();
	CreateEditRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEditRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	CreateEditRequest_model getModel();

	/*! \brief Set 
	 */
	void setModel(CreateEditRequest_model  model);
	/*! \brief Get The input text to use as a starting point for the edit.
	 */
	std::string getInput();

	/*! \brief Set The input text to use as a starting point for the edit.
	 */
	void setInput(std::string  input);
	/*! \brief Get The instruction that tells the model how to edit the prompt.
	 */
	std::string getInstruction();

	/*! \brief Set The instruction that tells the model how to edit the prompt.
	 */
	void setInstruction(std::string  instruction);
	/*! \brief Get How many edits to generate for the input and instruction.
	 */
	int getN();

	/*! \brief Set How many edits to generate for the input and instruction.
	 */
	void setN(int  n);
	/*! \brief Get What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
	 */
	long long getTemperature();

	/*! \brief Set What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
	 */
	void setTemperature(long long  temperature);
	/*! \brief Get An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
	 */
	long long getTopP();

	/*! \brief Set An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
	 */
	void setTopP(long long  top_p);

private:
	CreateEditRequest_model model;
	std::string input;
	std::string instruction;
	int n;
	long long temperature;
	long long top_p;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateEditRequest_H_ */

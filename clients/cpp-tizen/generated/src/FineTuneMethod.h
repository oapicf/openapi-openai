/*
 * FineTuneMethod.h
 *
 * The method used for fine-tuning.
 */

#ifndef _FineTuneMethod_H_
#define _FineTuneMethod_H_


#include <string>
#include "FineTuneDPOMethod.h"
#include "FineTuneSupervisedMethod.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The method used for fine-tuning.
 *
 *  \ingroup Models
 *
 */

class FineTuneMethod : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneMethod();
	FineTuneMethod(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneMethod();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of method. Is either `supervised` or `dpo`.
	 */
	std::string getType();

	/*! \brief Set The type of method. Is either `supervised` or `dpo`.
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	FineTuneSupervisedMethod getSupervised();

	/*! \brief Set 
	 */
	void setSupervised(FineTuneSupervisedMethod  supervised);
	/*! \brief Get 
	 */
	FineTuneDPOMethod getDpo();

	/*! \brief Set 
	 */
	void setDpo(FineTuneDPOMethod  dpo);

private:
	std::string type;
	FineTuneSupervisedMethod supervised;
	FineTuneDPOMethod dpo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneMethod_H_ */

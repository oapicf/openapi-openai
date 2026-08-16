
/*
 * FineTuneMethod.h
 *
 * The method used for fine-tuning.
 */

#ifndef TINY_CPP_CLIENT_FineTuneMethod_H_
#define TINY_CPP_CLIENT_FineTuneMethod_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTuneDPOMethod.h"
#include "FineTuneSupervisedMethod.h"

namespace Tiny {


/*! \brief The method used for fine-tuning.
 *
 *  \ingroup Models
 *
 */

class FineTuneMethod{
public:

    /*! \brief Constructor.
	 */
    FineTuneMethod();
    FineTuneMethod(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuneMethod();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string type{};
    FineTuneSupervisedMethod supervised;
    FineTuneDPOMethod dpo;
};
}

#endif /* TINY_CPP_CLIENT_FineTuneMethod_H_ */
